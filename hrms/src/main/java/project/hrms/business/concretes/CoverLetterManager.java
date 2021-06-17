package project.hrms.business.concretes;

import java.util.List;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.CoverLetterService;
import project.hrms.business.constants.Messages;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.CoverLetterDao;
import project.hrms.entities.concretes.CoverLetter;
import project.hrms.entities.dtos.coverLetter.CoverLetterAddDto;
import project.hrms.entities.dtos.coverLetter.CoverLetterDto;
import project.hrms.entities.dtos.coverLetter.CoverLetterUpdateDto;

@Service
public class CoverLetterManager implements CoverLetterService {

  @Autowired
  private ModelMapper modelMapper;
  private CoverLetterDao coverLetterDao;

  public CoverLetterManager(CoverLetterDao coverLetterDao) {
    this.coverLetterDao = coverLetterDao;
  }

  // command
  @Override
  public Result add(CoverLetterAddDto coverLetterAddDto) {
    var coverLetter = modelMapper.map(coverLetterAddDto, CoverLetter.class);
    this.coverLetterDao.save(coverLetter);
    return new SuccessResult();
  }

  @Override
  public Result delete(int coverLetterId) {
    var coverLetter=this.coverLetterDao.findById(coverLetterId).orElse(null);
    this.coverLetterDao.delete(coverLetter);
    return new SuccessResult(Messages.Deleted);
  }

  @Override
  public Result update(CoverLetterUpdateDto coverLetterUpdateDto) {
    var coverLetter = modelMapper.map(coverLetterUpdateDto, CoverLetter.class);
    this.coverLetterDao.save(coverLetter);
    return new SuccessResult();
  }

  // query
  @Override
  public DataResult<List<CoverLetterDto>> getAll() {
    var coverLetters = this.coverLetterDao.findAll();
    List<CoverLetterDto> coverLettersDto = modelMapper.map(
      coverLetters, new TypeToken<List<CoverLetterDto>>() {}.getType());
    return new SuccessDataResult<List<CoverLetterDto>>(coverLettersDto);
  }

  @Override
  public DataResult<CoverLetterDto> getById(int coverLetterId) {
    var coverLetter = this.coverLetterDao.getById(coverLetterId);
    var coverLetterDto=modelMapper.map(coverLetter, CoverLetterDto.class);
    return new SuccessDataResult<CoverLetterDto>(coverLetterDto);
  }
}
