package project.hrms.business.adapters;

import java.io.IOException;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import org.springframework.stereotype.Service;

import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessResult;

@Service
public class CloudinaryServiceImageAdapter implements ImageService {

    private Cloudinary cloudinary;
    public CloudinaryServiceImageAdapter() {
        this.cloudinary=new Cloudinary("cloudinary://234582336253651:XNqFv9tuvVuI-JP1nK5zgr7We2A@dg4195efx");
    }
    @Override
    public Result upload(String imagePath) throws IOException{
        cloudinary.uploader().upload(imagePath, ObjectUtils.emptyMap());
        cloudinary.url().generate(imagePath+"");
        return new SuccessResult();
    }
}