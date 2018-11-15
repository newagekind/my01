package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * 帐户web
 */
@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层：查询所有账户...");
        // 调用service的方法
        List<Account> accounts = accountService.findAll();
        model.addAttribute("accounts",accounts);
        return "list";
    }

    /**
     * 保存
     * @return
     */
    @RequestMapping("/save")
    public String save(HttpServletRequest request,Account account, MultipartFile imgFile) throws IOException {
        System.out.println("表现层：保存账户...");
        // 获取上传文件的原始路径
        String originalFilename = imgFile.getOriginalFilename();
        ServletContext servletContext = request.getSession().getServletContext();

        File file=new File(servletContext.getRealPath("images"),originalFilename);
        // 保存文件
        imgFile.transferTo(file);
        // 设置文件保存路径
        String imgPath = servletContext.getContextPath()+"/images/"+originalFilename;
        // 给account设置文件路径
        account.setImgSrc(imgPath);
        accountService.saveAccount(account);
        return "redirect:findAll";
    }



}
