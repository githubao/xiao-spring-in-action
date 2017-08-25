package me.xiao.springlearn.ch01;

/**
 * 勇敢的骑士
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/8/25 17:28
 */

public class BraveKnight implements Knight{
    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
