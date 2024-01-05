namespace _13_File_IO_and_Stream
{
    internal class Assignment
    {
        static void Main1(string[] args)
        {
            string path = @"E:\GitHub\PG-DAC git\.net\test.txt";
            string testdata = File.ReadAllText(path);
            Console.WriteLine(testdata);

            string[] testdata1 = File.ReadAllLines(path);
            int cnt = 0;
            foreach (string line in testdata1) 
            {
                Console.WriteLine(cnt++ +" "+line);
            }
        }
    }
}
