package project.hrms.business.concretes;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.CoverLetterService;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.CoverLetterDao;
import project.hrms.entities.concretes.CoverLetter;
import project.hrms.entities.dtos.CoverLetterAddDto;

@Service
public class CoverLetterManager implements CoverLetterService {
  @Autowired
  private ModelMapper modelMapper;
  @Autowired
  private CoverLetterDao coverLetterDao;

  public CoverLetterManager(CoverLetterDao coverLetterDao) {
    this.coverLetterDao = coverLetterDao;
  }

  @Override
  public Result add(CoverLetterAddDto coverLetterAddDto) {
    CoverLetter coverLetter = modelMapper.map(coverLetterAddDto, CoverLetter.class);
    this.coverLetterDao.save(coverLetter);
    return new SuccessResult();
  }

}
