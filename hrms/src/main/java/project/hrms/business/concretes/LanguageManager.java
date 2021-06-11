package project.hrms.business.concretes;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.hrms.business.abstracts.LanguageService;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.LanguageDao;
import project.hrms.entities.concretes.Language;
import project.hrms.entities.dtos.language.LanguageAddDto;

@Service
public class LanguageManager implements LanguageService {

    @Autowired
    private ModelMapper modelMapper;
    private LanguageDao languageDao;
    public LanguageManager(LanguageDao languageDao) {
        this.languageDao = languageDao;
    }

    @Override
    public Result add(LanguageAddDto languageAddDto) {
        var language=modelMapper.map(languageAddDto, Language.class);
        this.languageDao.save(language);
        return new SuccessResult();
    }

}
