package BLL;

import ENTITY.Guide;

import java.util.ArrayList;
import java.util.List;

public class File {
    private final List<Guide> guides = new ArrayList<Guide>();

    public void addGuide(Guide guide){
        guides.add(guide);
    }

    public List<Guide> getGuides(){
        return guides;
    }

}
