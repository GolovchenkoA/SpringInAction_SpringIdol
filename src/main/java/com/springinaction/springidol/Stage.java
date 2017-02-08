package com.springinaction.springidol;

/**
 * Created by головченко on 08.02.2017.
 */
public class Stage {

    private Stage() {
    }
    private static class StageSingletonHolder {
        static Stage instance = new Stage(); // Создание экземпляра
    }
    public static Stage getInstance() {
        return StageSingletonHolder.instance; // Возвращает экземпляр
    }
}
