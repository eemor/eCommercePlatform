package com.coderscampus.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DashboardController
{
  @RequestMapping(value="/", method=RequestMethod.GET)
  public String rootGet ()
  {
    return "redirect:/dashboard";
  }
  
  @RequestMapping(value="/dashboard", method=RequestMethod.GET)
  public String dashboardGet (ModelMap model)
  {
    return "dashboard";
  }
}
