#include <vector>
#include <iostream>
#include <string>

using namespace std;

std::vector<int> twoSum(std::vector<int> &nums, int target)
{
    std::vector<int> result;

    for (int i=0; i<nums.size(); i++)
    {
        for (int j=i+1; j<nums.size(); j++)
        {
            if (nums[i] + nums[j] == target)
            {
                result.push_back(i);
                result.push_back(j);
                return result;
            }
        }
    }
}

int main()
{
    char hello[] = "Hello, World!"; // string as a character array
    string helloStr = "Hello, World!"; // string as a C++ string object
    return 0;
}