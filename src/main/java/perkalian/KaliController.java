package perkalian;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;
import java.util.*;

@Controller
public class KaliController {
	
	@RequestMapping("/perkalian")
	public String greeting(@RequestParam(value = "a", required = false, defaultValue = "0") String m,
		@RequestParam(value = "b", required = false, defaultValue = "0") String n,  Model model) {
		model.addAttribute ("a", Integer.parseInt(m));
		model.addAttribute ("b", Integer.parseInt(n));
		model.addAttribute ("y", Integer.parseInt(m)*Integer.parseInt(n));
		return "perkalian";
	}
}
