package kurs.Jokes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michal Snopek on 11.07.2019.
 */
@Controller
public class UserController {
    @GetMapping("users")
    public String getUser(ModelMap modelMap){
        RegularUser user=new RegularUser("adam","Kowalsi");
        RegularUser user2=new RegularUser("adam2","Kowalsi");
        Admin admin =new Admin("admin","adminadmin");
        Admin admin2 =new Admin("admin2","adminadmin2");

        List<User>users=new ArrayList<>();
        //admin jest traktowany jako Uer

        users.add(user);
        users.add(user2);
        users.add(admin);
        users.add(admin2);

        modelMap.put("users",users);
        return "users";
    }
}
