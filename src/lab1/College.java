/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ltrinastic
 */
public class College {
    private List<ProgrammingDegreeCourses> courseCatalog;

    public College() {
        courseCatalog = new ArrayList<>();
    }

    public void addProgrammingCourseToCatalog( ProgrammingDegreeCourses course) {
        courseCatalog.add(course);
    }
    
    
}
