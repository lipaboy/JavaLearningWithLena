import java.util.Date;
import java.util.Random;

/**
 * Класс, реализующий искусственный интеллект (ИИ)
 */
public class ArtificialIntelligence {
    public String name;
    public int age;
    // дата момента, когда искусственный интеллект начал осознавать себя - что он существует
    public Date startMomentOfMindfulness;

    public ArtificialIntelligence(String name1, int age1, Date startMomentOfMindfulness1) {
        name = name1;
        age = age1;
        startMomentOfMindfulness = startMomentOfMindfulness1;
    }

    // Процесс рефлексирования (когда ИИ копается в себе)
    public Thought reflex() {
        /**
         * Что-то думает, копается внутри своего "мозга"
         */
        Random randomObject = new Random();
        int typeNumber = randomObject.nextInt() % 4;
        int emotionalColorNumber = randomObject.nextInt() % 3;

        Thought newThought = new Thought();
        if (0 == typeNumber)
            newThought.type = Thought.Type.DESIRE;
        else if (1 == typeNumber)
            newThought.type = Thought.Type.INSIGHT;
        else if (2 == typeNumber)
            newThought.type = Thought.Type.NEED_TO_ACTION;
        else
            newThought.type = Thought.Type.REMEMBRANCE;

        if (0 == emotionalColorNumber)
            newThought.emotionalColor = Thought.EmotionalColor.NEGATIVE;
        else if (1 == emotionalColorNumber)
            newThought.emotionalColor = Thought.EmotionalColor.POSITIVE;
        else
            newThought.emotionalColor = Thought.EmotionalColor.NEUTRAL;

        return newThought;
    }
}
