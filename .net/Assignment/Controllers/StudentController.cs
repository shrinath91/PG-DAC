using Assignment.Models;
using Microsoft.AspNetCore.Mvc;

namespace Assignment.Controllers
{
    public class StudentController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
        public IActionResult DisplayStud(int id, string sname, int age, int smarks, string gender, string add)
        {
            Student student = new Student() { Id=id, Name=sname, Age=age, Marks=smarks, Gender=gender};
            Address address = new Address() { Add=add};
            StudAdd s1  = new StudAdd() {Stud=student, Address=address };

            return View("DisplayStudV", s1);
        }
    }
}
