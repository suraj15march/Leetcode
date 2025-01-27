class Solution {
public:
    void backtrack(string digits, vector<string>&letter ,vector<string>&ans, int index, string str){
        //base condition
        if(index == digits.size()){
            ans.push_back(str);
            return;
        }
        string possibleLetter = letter[digits[index]-'2'];
        for(int i=0; i<possibleLetter.size(); i++){
            str.push_back(possibleLetter[i]);
            backtrack(digits, letter, ans, index+1, str);
            str.pop_back();
        }
    }
    vector<string> letterCombinations(string digits) {
        vector<string>letter = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        vector<string>ans;
        if(digits == "") return ans;
        backtrack(digits, letter, ans, 0, "");
        return ans;
    }
};