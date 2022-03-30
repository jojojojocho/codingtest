package com.codingtest.programmers.level2;

public class SkillTree {

    public int solution(String skill, String[] skill_trees) {

        int cnt=0;

        for (int i = 0; i < skill_trees.length; i++) {
            //배열에서 하나씩 가져온다
            String skill_tree = skill_trees[i];
            //쓸모없는 문자 제거
            String s = skill_tree.replaceAll("[^" + skill +"]", "");

            if(skill.startsWith(s)) cnt++;

        }
        return cnt;
    }

    public static void main(String[] args) {
        SkillTree skillTree = new SkillTree();
        int cbd = skillTree.solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"});
        System.out.println(cbd);
    }
}
