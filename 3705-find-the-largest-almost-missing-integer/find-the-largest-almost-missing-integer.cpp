class Solution {
public:
    int largestInteger(vector<int>& nums, int k) {

        unordered_map<int, int> mp;

        for (int i = 0; i <= nums.size() - k; i++) {

            unordered_set<int> st;

            for (int j = i; j < i + k; j++) {
                st.insert(nums[j]);
            }

            for (int x : st) {
                mp[x]++;
            }
        }

        int ans = -1;

        for (auto x : mp) {
            if (x.second == 1) {
                ans = max(ans, x.first);
            }
        }

        return ans;
    }
};