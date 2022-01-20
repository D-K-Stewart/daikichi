package com.david.daikichi;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
	
@RestController
public class HomeController {
    @RequestMapping("/daikichi/travel/{city}")
    public String showLesson(@PathVariable("city") String city) {
    	return "Congratulations! You will soon travel to " + city;
    }
    
    @RequestMapping("/daikichi/lotto/{num}")
    public String showLesson(@PathVariable("num") int num) {
    	if (num %2 == 0) {
    		return "You will take a grand journey in the near future, but be weary of tempting offers. ";
    	}else {
    		return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
    	}
    }
    
    
    
    
    
    
    
    
    


//	@RequestMapping("/")
//	// 3. Method that maps to the request route above
//	public String welcome() { // 3
//	        return "Congratulations! You will soon travel to Honolulu!";
//	}
//	
//	@RequestMapping("/daikichi/lotto/6")
//	// 3. Method that maps to the request route above
//	public String today() { // 3
//	        return "Today you will fird luck in all your endeavors!";
//	}
//	
//	@RequestMapping("/daikichi/tomorrow")
//	// 3. Method that maps to the request route above
//	public String tomorrow() { // 3
//	        return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
//	}


}
