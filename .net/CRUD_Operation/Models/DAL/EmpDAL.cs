using MySqlConnector;

namespace CRUD_Operation.Models.DAL
{
    public class EmpDAL
    {
        public List<Emp> GetEmps() 
        {
            List<Emp> emps = new List<Emp>();
            string con = "Server=localhost;userid=root;password=root;database=know_it";
            using (MySqlConnection conCon = new MySqlConnection(con))
            {
                try
                {
                    conCon.Open();
                    string query = "Select * from emp10";
                    MySqlCommand cmd = new MySqlCommand(query, conCon);
                    MySqlDataReader reader = cmd.ExecuteReader();
                    while (reader.Read()) 
                    {
                        Emp emp = new Emp() 
                        {
                            Id = Convert.ToInt32(reader[0]),
                            Name = Convert.ToString(reader[1]),
                            Sal = Convert.ToInt32(reader[2]),
                            Address = Convert.ToString(reader[3]),
                            Gender = Convert.ToString(reader[4])
                        };
                        emps.Add(emp);
                    }
                    conCon.Close();
                }
                catch (Exception ex) { }
            }
            return emps;
        }
        public int InsertEmp(Emp emp)
        {
            int res = 0;
            string con = "Server=localhost;userid=root;password=root;database=know_it";
            using (MySqlConnection conCon = new MySqlConnection(con))
            {
                try
                {
                    conCon.Open();
                    string query = "insert into emp10 values(@id,@name,@sal,@add,@gen)";
                    MySqlCommand cmd = new MySqlCommand( query, conCon);
                    cmd.Parameters.AddWithValue("@id", emp.Id);
                    cmd.Parameters.AddWithValue("@name", emp.Name);
                    cmd.Parameters.AddWithValue("@sal", emp.Sal);
                    cmd.Parameters.AddWithValue("@add", emp.Address);
                    cmd.Parameters.AddWithValue("@gen", emp.Gender);
                    res = cmd.ExecuteNonQuery();
                }
                catch(Exception ex)
                {

                }
            }
            return res;
        }
        public Emp GetEmp(int id)
        {
            Emp emp=null;
            string con = "Server=localhost;userid=root;password=root;database=know_it";
            using (MySqlConnection conCon = new MySqlConnection(con))
            {
                conCon.Open();
                string query = "Select * from emp10 where id=@id";
                MySqlCommand cmd = new MySqlCommand(query, conCon); 
                cmd.Parameters.AddWithValue("id", id);
                MySqlDataReader reader = cmd.ExecuteReader();
                while(reader.Read())
                {
                    emp = new Emp()
                    {
                        Id = Convert.ToInt32(reader[0]),
                        Name = Convert.ToString(reader[1]),
                        Sal = Convert.ToInt32(reader[2]),
                        Address = Convert.ToString(reader[3]),
                        Gender = Convert.ToString(reader[4])
                    };
                }
            }
            return emp;
        }
        public int UpEmp(Emp e)
        {
            int res = 0;
            try
            {
                string con = "Server=localhost;userid=root;password=root;database=know_it";
                using (MySqlConnection conCon = new MySqlConnection(con))
                {
                    conCon.Open();
                    string query = "Update emp10 set name=@Name, salary=@Sal, address=@Add, gender=@Gen where id=@Id";
                    MySqlCommand cmd = new MySqlCommand(query, conCon);
                    cmd.Parameters.AddWithValue("@Id", e.Id);
                    cmd.Parameters.AddWithValue("@Name", e.Name);
                    cmd.Parameters.AddWithValue("@Sal", e.Sal);
                    cmd.Parameters.AddWithValue("@Add", e.Address);
                    cmd.Parameters.AddWithValue("@Gen", e.Gender);
                    res = cmd.ExecuteNonQuery();
                }
            }
            catch(Exception ex) 
            { }
            return res;
        }
        public int DelEmp(int id)
        {
            int res = 0;
            string con = "Server=localhost;userid=root;password=root;database=know_it";
            using (MySqlConnection conCon = new MySqlConnection(con)) 
            {
                try
                {
                    conCon.Open();
                    string query = "delete from emp10 where id=@Id";
                    MySqlCommand cmd = new MySqlCommand(query, conCon);
                    cmd.Parameters.AddWithValue("@id", id);
                    res = cmd.ExecuteNonQuery();
                }
                catch(Exception exc)
                {}
            }
            return res;
        }
        
    }
}
