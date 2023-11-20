using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Program
{
    class Program
    {
        static void Main(string[] args)
        {        
            string input1 = "ABCABC";
            string input2 = "ABC";

            GcdOfStrings(input1,input2);
        }

        public static string GcdOfStrings(string str1, string str2)
        {
            if (str1 == "" || str2 == "") return "";
            if (str1[0] != str2[0]) return "";

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < str1.Length -1 ; i++)
            {
                if (str1.ElementAt(i) == str2.ElementAt(i))
                {
                    sb.Append(str2.ElementAt(i));
                }
            }

            return sb.ToString();
        }

        public static int RemoveElement(int[] nums, int val)
        {
            int counter = 0;           
          
            for (int i = 0; i < nums.Length; i++)
            {
                if (!Equals(nums[i], val))
                {
                    nums[counter] = nums[i];
                    counter++;
                } 
            }  
            return counter;
        }

        public static int RemoveDuplicates(int[] nums)
        {
            Console.WriteLine(string.Join(", ", nums));
            int[] unique = nums.Distinct().ToArray();
            Console.WriteLine(string.Join(", ", unique));
            int k = unique.Length;

            for (int i = 0; i < k; i++)
            {
                System.Console.WriteLine("Placing " + unique[i] + " at index " + i);
                nums[i] = unique[i];
            }
            return k;
        }

    }
}