package project.hrms.business.concretes;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.LanguageService;
import project.hrms.business.constants.Messages;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.LanguageDao;
import project.hrms.entities.concretes.Language;
import project.hrms.entities.dtos.language.LanguageAddDto;
import project.hrms.entities.dtos.language.LanguageDto;
import project.hrms.entities.dtos.language.LanguageUpdateDto;

@Service
public class LanguageManager implements LanguageService {

    @Autowired
    private ModelMapper modelMapper;
    private LanguageDao languageDao;

    public LanguageManager(LanguageDao languageDao,ModelMapper modelMapper) {
        this.languageDao = languageDao;
        this.modelMapper=modelMapper;
    }

    // command
    @Override
    public Result add(LanguageAddDto languageAddDto) {
        var language = modelMapper.map(languageAddDto, Language.class);
        this.languageDao.save(language);
        return new SuccessResult(Messages.Added);
    }

    @Override
    public Result delete(int languageId) {
        var language = this.languageDao.getById(languageId);
        this.languageDao.delete(language);
        return new SuccessResult(Messages.Deleted);
    }

    @Override
    public Result update(LanguageUpdateDto languageUpdateDto) {
        var language = modelMapper.map(languageUpdateDto, Language.class);
        this.languageDao.save(language);
        return new SuccessResult(Messages.Updated);
    }

    // query
    @Override
    public DataResult<List<LanguageDto>> getAll() {
        var languages = this.languageDao.findAll();
        List<LanguageDto> languagesDto = modelMapper.map(
            languages, new TypeToken<List<LanguageDto>>() {}.getType());
        return new SuccessDataResult<List<LanguageDto>>(languagesDto);
    }

    @Override
    public DataResult<LanguageDto> getById(int languageId) {
        var language = this.languageDao.getById(languageId);
        var languageDto=modelMapper.map(language, LanguageDto.class);
        return new SuccessDataResult<LanguageDto>(languageDto);
    }

}
