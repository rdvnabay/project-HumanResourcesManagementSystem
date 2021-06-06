package project.hrms.business.adapters;

import java.io.IOException;
import project.hrms.core.utilities.results.Result;

public interface ImageService {
    public Result upload(String imagePath) throws IOException;
}
