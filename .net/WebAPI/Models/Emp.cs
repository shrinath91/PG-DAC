using System;
using System.Collections.Generic;

namespace WebAPI.Models
{
    public partial class Emp
    {
        public int Id { get; set; }
        public string? Name { get; set; }
        public int? Salary { get; set; }
        public string? Address { get; set; }
        public string? Gender { get; set; }
    }
}
