
using MySqlConnector;
using System.Security.Cryptography.X509Certificates;

namespace _15_Ado.net
{
    internal class DBConnectivity
    {
        static void Main(string[] args)
        {
            //DisplayData();
            //InsertData();
            //UpdateData();
            //DeleteData();
            TotEMP();
        }
        public static void DisplayData()
        {
            string str = "Server=localhost;userid=root;password=root;database=know_it";

            using (MySqlConnection conn = new MySqlConnection(str))
            {
                conn.Open();
                Console.WriteLine("Connection Established!!!");

                string query = "Select * from emp100";
                
                MySqlCommand cmd = new MySqlCommand(query, conn);

                MySqlDataReader reader = cmd.ExecuteReader();
                while(reader.Read())
                {
                    Console.WriteLine(reader.GetInt32(0)+" "+reader.GetString(1)+" "+reader.GetString(2));
                }
                conn.Close();

            }

        }
        public static void InsertData()
        {
            string str = "Server=localhost;userid=root;password=root;database=know_it";

            using (MySqlConnection conn = new MySqlConnection(str))
            {
                conn.Open();

                string query = "Insert into emp100(EMPNO,ENAME,JOB,SAL) values(@EMPNO,@ENAME,@JOB,@SAL)";

                MySqlCommand cmd = new MySqlCommand(query, conn);
                cmd.Parameters.AddWithValue("@EMPNO",9999);
                cmd.Parameters.AddWithValue("@ENAME", "Makarand");
                cmd.Parameters.AddWithValue("@JOB", "Clerk");
                cmd.Parameters.AddWithValue("@SAL", 18000);

                int res = cmd.ExecuteNonQuery();
                Console.WriteLine(res+ "record added successfully!");
                conn.Close();
            }
        }
        public static void UpdateData()
        {
            
            string str = "Server=localhost;userid=root;password=root;database=know_it";

            using (MySqlConnection conn = new MySqlConnection(str))
            {
                conn.Open();
                string query = "update emp100 set ename=@ENAME1 where empno=9999";

                MySqlCommand cmd = new MySqlCommand(query, conn);
                cmd.Parameters.AddWithValue("ENAME1", "Satish");

                int res = cmd.ExecuteNonQuery();
                Console.WriteLine(res + " record updatetd successfully");
                conn.Close();
            }
        }
        public static void DeleteData() 
        {
            string str = "Server=localhost;userid=root;password=root;database=know_it";
            using (MySqlConnection conn = new MySqlConnection(str))
            {
                conn.Open();

                string query = "delete from emp100 where empno=@eno";
                MySqlCommand cmd = new MySqlCommand(query, conn);
                cmd.Parameters.AddWithValue("@eno", 9999);

                int res = cmd.ExecuteNonQuery();
                Console.WriteLine(res + " record deleted successfully");
                conn.Close();
            }
        }
        public static void TotEMP()
        {
            string str = "Server=localhost;userid=root;password=root;database=know_it";
            using (MySqlConnection conn = new MySqlConnection(str))
            {
                conn.Open();
                string query = "Select count(*) from emp100";
                MySqlCommand cmd = new MySqlCommand(query, conn);

                dynamic res = cmd.ExecuteScalar();
                Console.WriteLine(res + " Records are available in emp100");
                conn.Close();
            }

        }
    }
}
