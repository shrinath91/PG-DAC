using CRUD_Operation.Models;
using CRUD_Operation.Models.DAL;
using Microsoft.AspNetCore.Mvc;

namespace CRUD_Operation.Controllers
{
    public class EmployeeController : Controller
    {
       public IActionResult EmpList()
       {
            EmpDAL empDAL = new EmpDAL();   
            List<Emp> emps = empDAL.GetEmps();
            return View(emps);
       }
        [HttpGet]
        public IActionResult AddEmp() 
        {       
            return View();
        }
        [HttpPost]
        public IActionResult AddEmp(Emp e)
        {
            EmpDAL empDal = new EmpDAL();
            int res = empDal.InsertEmp(e);
            if(res>0)
            {
                return RedirectToAction("EmpList");
            }
            return Content("Could not Add!!!");

        }
        [HttpGet]
        public IActionResult UpdateEmp(int id) 
        {
            EmpDAL empDAL = new EmpDAL();
            Emp emp = empDAL.GetEmp(id);
            return View(emp);
        }
        [HttpPost]
        public IActionResult UpdateEmp(Emp emp) 
        {
            EmpDAL empDAL = new EmpDAL();
            int res = empDAL.UpEmp(emp);
            if(res>0)
            {
                return RedirectToAction("EmpList");
            }
            return Content("Could not update!!!");
        }
        public IActionResult DeleteEmp(int id)
        {
            int res = 0;
            EmpDAL empdal = new EmpDAL();
            res = empdal.DelEmp(id);
            if(res>0) 
            {
                return RedirectToAction("EmpList");
            }
            return Content("Could not delete!!!");
        }

    }
}
