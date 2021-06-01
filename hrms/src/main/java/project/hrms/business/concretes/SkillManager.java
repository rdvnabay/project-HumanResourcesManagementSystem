package project.hrms.business.concretes;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.SkillService;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.SkillDao;
import project.hrms.entities.concretes.Skill;
import project.hrms.entities.dtos.SkillAddDto;

@Service
public class SkillManager implements SkillService{

    @Autowired
    private ModelMapper modelMapper;
    private SkillDao skillDao;
    public SkillManager(SkillDao skillDao) {
        this.skillDao=skillDao;
    }
    @Override
    public Result add(SkillAddDto skillAddDto) {
        var skill=modelMapper.map(skillAddDto, Skill.class);
       this.skillDao.save(skill);
        return new SuccessResult();
    }
}
