package repository.impl;

import model.Score;
import repository.ScoreRepository;

import java.util.ArrayList;
import java.util.List;

public class ScoreRepositoryMemoryImpl implements ScoreRepository {

    protected List<Score> scores = new ArrayList<Score>();


    @Override
    public List<Score> getAll() {
        return scores;
    }

    @Override
    public boolean save(Score score) {
        scores.add(score);
        return true;
    }
}
