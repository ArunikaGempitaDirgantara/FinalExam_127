/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelasa.uas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Iqbal Syabana Azmi (20200140127)
 */
@Controller
@ResponseBody
public class UjianController {
    ujian data = new ujian ();
    ujianJpaController control = new ujianJpaController();
    
    @RequestMapping("/getName/{id}")
    public String getName (@PathVariable("id")int id){
        try {
            data = control.findujian(id);
            return data.getId()+"<br>"+data.getId();
        }
        
        catch (Exception error){return "Data Tidak Ada";}
    }
    
    @RequestMapping("/delete/{id}")
    public String deleteData(@PathVariable("id")int id) {
        try {
            control.destroy.(id);
            return id + "Deleted";
        }
        catch (Exception Error){return id + "tidak ada";}
    }
}
