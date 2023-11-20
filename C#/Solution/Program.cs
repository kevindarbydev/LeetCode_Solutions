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
            int[] input = { 0, 1, 2, 2, 3, 0, 4, 2 };

            RemoveElement(input, 2);
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