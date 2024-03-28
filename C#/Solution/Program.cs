using System.Text;

namespace Program
{
    class MyHashMap
    {
        private LinkedList<KeyValuePair<int, int>>[] buckets;
        private int size;
        private const int defaultSize = 100;
        private double loadFactor;

        private const double defaultLoadFactor = 0.75;
        private int count;

        public MyHashMap()
        {
            this.size = defaultSize;
            this.loadFactor = defaultLoadFactor;
            this.count = 0;
            buckets = new LinkedList<KeyValuePair<int, int>>[size];
        }

        public void Put(int key, int value)
        {
            int computedIndex = key.GetHashCode() % size;
            if (buckets[computedIndex] == null)
            {
                LinkedList<KeyValuePair<int, int>> newList = new LinkedList<KeyValuePair<int, int>>();
                KeyValuePair<int, int> newEntry = new(key, value);
                newList.AddLast(newEntry);
                buckets[computedIndex] = newList;

            }
            else
            {
                bool replaced = false;
                foreach (KeyValuePair<int, int> entry in buckets[computedIndex])
                {
                    if (entry.Key == key)
                    {
                        buckets[computedIndex].Remove(entry);
                        buckets[computedIndex].AddLast(new KeyValuePair<int, int>(key, value));
                        replaced = true;
                        break;
                    }
                }
                if (!replaced)
                {
                    buckets[computedIndex].AddLast(new KeyValuePair<int, int>(key, value));
                }
            }
            count++;

        }

        public int Get(int key)
        {
            int computedIndex = key.GetHashCode() % size;
            if (buckets[computedIndex] != null)
            {
                int value = buckets[computedIndex].First.Value.Value;
                return value;
            }
            return -1;
        }

        public void Remove(int key)
        {
            int computedIndex = key.GetHashCode() % size;
            if (buckets[computedIndex] != null)
            {
                LinkedList<KeyValuePair<int, int>> bucket = buckets[computedIndex];
                KeyValuePair<int, int> entryToRemove = default;

                foreach (KeyValuePair<int, int> entry in bucket)
                {
                    if (entry.Key == key)
                    {
                        entryToRemove = entry;
                        break;
                    }
                }

                if (!entryToRemove.Equals(default))
                {
                    bucket.Remove(entryToRemove);
                    count--;
                }
            }
        }

    }
    class Program
    {
        static void Main(string[] args)
        {

        }





        //Old solutions
        public static ListNode RemoveNthFromEnd(ListNode head, int n)
        {
            ListNode fast = head;
            ListNode slow = head;

            for (int i = 0; i < n; i++)
            {
                fast = fast.next;
            }
            if (fast == null) return head.next;

            while (fast.next != null)
            {
                slow = slow.next;
                fast = fast.next;
            }
            //skip over a node, effectively removing it
            slow.next = slow.next.next;
            return head;
        }

        public class ListNode
        {
            public int val;
            public ListNode next;
            public ListNode(int val = 0, ListNode next = null)
            {
                this.val = val;
                this.next = next;
            }
        }
        public int FindShortestSubArray(int[] nums)
        {
            int degree = 0; //find max frequency of any element (ex.  1,2,2,3,1) degree is 2 because 2 appears twice           
            Dictionary<int, int[]> dict = new Dictionary<int, int[]>();

            for (int i = 0; i < nums.Length; i++)
            {
                if (!dict.ContainsKey(nums[i]))
                {
                    dict.Add(nums[i], new int[] { 1, i, i });
                }
                else
                {
                    int[] temp = dict[nums[i]];
                    temp[0]++;
                    temp[2] = i;
                }
            }

            int lenOfSubArray = int.MaxValue;
            foreach (int[] arr in dict.Values)
            {
                if (arr[0] > degree)
                {
                    degree = arr[0];
                    lenOfSubArray = arr[2] - arr[1] + 1;
                }
                else if (arr[0] == degree)
                {
                    lenOfSubArray = Math.Min(arr[2] - arr[1] + 1, lenOfSubArray);
                }
            }
            return lenOfSubArray;
        }

        public static string GcdOfStrings(string str1, string str2)
        {
            if (str1 == "" || str2 == "") return "";
            if (str1[0] != str2[0]) return "";

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < str1.Length - 1; i++)
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