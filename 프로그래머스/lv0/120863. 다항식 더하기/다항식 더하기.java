class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] mono = polynomial.split(" \\+ ");
        int sumX = 0;
        int sumNum = 0;
        for(String word: mono) {
            if( word.contains("x") ) {
                word= word.replace("x", "");
                if ("".equals(word)){
                    sumX++;
                } else{
                    sumX += Integer.parseInt(word);
                }
            } else {
                sumNum += Integer.parseInt(word);
            }
        }

        if (sumX != 0 && sumNum != 0) {
            answer = sumX==1? "x + " + sumNum: sumX + "x + " + sumNum;
        } else if (sumX !=0 && sumNum == 0) {
            answer = sumX==1? "x":sumX + "x";
        }else if (sumX == 0 && sumNum != 0) {
            answer = sumNum+"";
        }else {
            answer = "0";
        }
        return answer;
    }
}