package com.gym.GYM.shopping.service;

import com.gym.GYM.shopping.dao.ShoppingAdminDAO;
import com.gym.GYM.shopping.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

@Service
public class ShoppingAdminServiceImpl implements ShoppingAdminService{

    @Autowired
    private ShoppingAdminDAO shoppingadmindao;

    @Autowired
    private HttpSession session;

    private ModelAndView mav = new ModelAndView();

    @Override
    public ModelAndView shoppingAdminList() {
        List<ProductDTO> shoppingAdminlist = shoppingadmindao.shoppingAdminList();
        mav.addObject("shoppingAdminList", shoppingAdminlist);
        mav.setViewName("Shopping/shoppingAdminList");

        return mav;
    }

    @Override
    public ModelAndView shoppingAdminRegist(ProductDTO product) throws IOException {
        // 1.파일 불러오기
        MultipartFile productPhotoFile = product.getProductPhotoFile();

        // 2.파일 이름 불러오기
        String originalFileName = productPhotoFile.getOriginalFilename();

        // 3.난수 생성하기
        String uuid = UUID.randomUUID().toString().substring(0, 8);

        // 3+2
        String productPhoto = uuid + "_" + originalFileName;

        // 5.파일 저장 위치 설정
        Path path = Paths.get(System.getProperty("user.dir"), "src/main/resources/static/uploadfile");
        String savePath = path + "/" + productPhoto;

        // 6.파일 선택 여부
        if (!productPhotoFile.isEmpty()) {
            product.setProductPhoto(productPhoto);
            productPhotoFile.transferTo(new File(savePath));
        } else {
            product.setProductPhoto("default.png");
        }

        int result = shoppingadmindao.shoppingAdminRegist(product);

        if (result > 0) {
            mav.setViewName("redirect:/boardList");
        } else {
            mav.setViewName("index");
        }
        return mav;
    }
}
