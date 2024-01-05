using Microsoft.AspNetCore.Mvc;
using MyFirstApp.Models;
using System.Diagnostics;

namespace MyFirstApp.Controllers
{
    public class HomeController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }

        public IActionResult Privacy()
        {
            return View();
        }

        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }
        //assignment
        public ViewResult ActionMethod1()
        {
            string str = "shrinath";
            return View("HelloView",(object)str);
        }
        public ViewResult ActionMethod2()
        {
            return View();
        }
        public JsonResult ActionMethod3()
        {
            var data = new { Empid = 1, Ename = "Shri" };
            return Json(data);
        }
        public IActionResult ActionMethod4()
        {
            //return Redirect("/Home/Index");
            //return RedirectToAction("ActionMethod3");//ACtion Name if within same controller
            return RedirectToAction("GetEmp","Employee");
        }
        public FileResult DownloadFile()
        {
            //Keep this file in WWWroot folder/Files
            return File("Files/Notes.txt", "application/txt", "Texttset.txt");
        }

        public IActionResult MyStatusCodes()
        {
            return StatusCode(StatusCodes.Status401Unauthorized);
        }
    }
}
