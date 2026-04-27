package com.myproject.demo.service;

import com.myproject.demo.model.Question;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentService {

    public List<Question> getAll() {
        return List.of(

                new Question(1L,"Course Selection","What are prerequisites?","You must complete required courses first."),
                new Question(2L,"Course Selection","How many courses can I take?","Depends on your credit limit."),
                new Question(3L,"Course Selection","Can I take advanced courses early?","Only if prerequisites are met."),
                new Question(4L,"Course Selection","How to choose electives?","Based on your interest and career goals."),
                new Question(5L,"Course Selection","Can I change courses later?","Yes during add/drop period."),
                new Question(6L,"Course Selection","Are online courses available?","Depends on department."),
                new Question(7L,"Course Selection","What if a course is full?","Waitlist or try next semester."),
                new Question(8L,"Course Selection","How to check course details?","Check university portal."),
                new Question(9L,"Course Selection","Can I repeat a course?","Yes if policy allows."),
                new Question(10L,"Course Selection","Who approves course plan?","Academic advisor."),

                new Question(11L,"Academic Progression","What is graduation requirement?","Complete all credits."),
                new Question(12L,"Academic Progression","Minimum GPA required?","Usually 2.0 or higher."),
                new Question(13L,"Academic Progression","What is probation?","Low GPA warning."),
                new Question(14L,"Academic Progression","How to recover from probation?","Improve grades."),
                new Question(15L,"Academic Progression","What happens if I fail?","Retake course."),
                new Question(16L,"Academic Progression","How to track progress?","Use student portal."),
                new Question(17L,"Academic Progression","Can I graduate early?","If credits completed."),
                new Question(18L,"Academic Progression","What delays graduation?","Missing credits."),
                new Question(19L,"Academic Progression","Are summer courses allowed?","Yes if available."),
                new Question(20L,"Academic Progression","Who checks graduation eligibility?","Registrar office."),

                new Question(21L,"Policies","What is add/drop?","Changing courses early semester."),
                new Question(22L,"Policies","Can I transfer credits?","Yes with approval."),
                new Question(23L,"Policies","Retake policy?","Replace or improve grade."),
                new Question(24L,"Policies","Withdrawal policy?","You can withdraw with record."),
                new Question(25L,"Policies","Late registration allowed?","With penalty."),
                new Question(26L,"Policies","Attendance requirement?","Usually 75%."),
                new Question(27L,"Policies","Exam retake possible?","Rarely."),
                new Question(28L,"Policies","Course cancellation?","If low enrollment."),
                new Question(29L,"Policies","Academic misconduct?","Strict penalties."),
                new Question(30L,"Policies","Who explains policies?","Admin office."),

                new Question(31L,"Internship & Project","How to apply internship?","Via department."),
                new Question(32L,"Internship & Project","Is internship mandatory?","Yes for some programs."),
                new Question(33L,"Internship & Project","What is capstone?","Final project."),
                new Question(34L,"Internship & Project","How to choose project topic?","With supervisor."),
                new Question(35L,"Internship & Project","Group project allowed?","Depends."),
                new Question(36L,"Internship & Project","Internship duration?","Usually 3 months."),
                new Question(37L,"Internship & Project","Can I do remote internship?","If approved."),
                new Question(38L,"Internship & Project","Project grading?","Based on performance."),
                new Question(39L,"Internship & Project","Supervisor role?","Guidance."),
                new Question(40L,"Internship & Project","Submission deadline?","Set by department."),

                new Question(41L,"Advising & Support","How to book advising?","Online or office."),
                new Question(42L,"Advising & Support","Who is my advisor?","Assigned faculty."),
                new Question(43L,"Advising & Support","When to meet advisor?","Before registration."),
                new Question(44L,"Advising & Support","Can I change advisor?","With approval."),
                new Question(45L,"Advising & Support","What help can I get?","Academic guidance."),
                new Question(46L,"Advising & Support","What if issue is complex?","Refer to HoD."),
                new Question(47L,"Advising & Support","Are records maintained?","Yes."),
                new Question(48L,"Advising & Support","Can I get career advice?","Yes."),
                new Question(49L,"Advising & Support","How to balance workload?","Advisor helps."),
                new Question(50L,"Advising & Support","Where to ask questions?","Student portal.")
        );
    }

    public Map<String, List<Question>> getGrouped() {
        Map<String, List<Question>> map = new LinkedHashMap<>();

        for (Question q : getAll()) {
            map.computeIfAbsent(q.getCategory(), k -> new ArrayList<>()).add(q);
        }

        return map;
    }
}