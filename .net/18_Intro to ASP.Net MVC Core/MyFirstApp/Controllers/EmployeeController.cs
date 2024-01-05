using Microsoft.AspNetCore.Mvc;

namespace MyFirstApp.Controllers
{
    public class EmployeeController : Controller
    {
        public IActionResult Index()
        {
            return Content("Hello");
        }
        public string GetEmployee()
        {
            return "Helloooooo";
        }

        [NonAction]
        public string GetEmployee1()
        {
            return "Hello1";
        }
        [ActionName("Getemp")]
        public string GetEmployee2()
        {
            return "Getemp: Hello";
        }
        [HttpPost]
        public string GetEmployee3()
        {
            return "With HTTPPost: Hello";
        }

        /*public FileResult DownloadFile()
        {
            return File("Files/Notes.txt","Application/txt","TestNew.txt");
        }*/
    }
}
