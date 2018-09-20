package com.example.android.musicappudacity;

import java.util.ArrayList;

public class Music extends ArrayList {
    private ArrayList<CompositionClass> music = new ArrayList<>();

    public ArrayList getMusicList() {
        music.add(new CompositionClass("Shakira", "Sale el Sol",
                "46:04", 15, "Rabiosa",
                "2:52", R.drawable.sale_el_sol_shakira));
        music.add(new CompositionClass("Beyonce", "Lemonade",
                "45:42", 12, "Sorry",
                "3:52", R.drawable.lemonade_beyonce));
        music.add(new CompositionClass("Post Malone", "Beerbongs & Bentleys",
                "64:26", 18, "Rockstar",
                "3:39", R.drawable.beerbongs_and_bentleys_post_malone));
        music.add(new CompositionClass("Bryan Adams", "11",
                "47:12", 11, "Somethin' to Believe in",
                "4:01", R.drawable.eleven_bryan_adams));
        music.add(new CompositionClass("Justin Timberlake", "Justified",
                "63:15", 13, "Cry Me a River",
                "4:48", R.drawable.justified_justin_timberlake));
        music.add(new CompositionClass("Usher", "Confessions",
                "60:30", 17, "Burn",
                "4:16", R.drawable.confessions_usher));
        music.add(new CompositionClass("Alicia Keys", "The Diary of Alicia Keys",
                "57:45", 15, "If I Ain't Got You",
                "3:48", R.drawable.the_diary_of_alicia_keys));
        music.add(new CompositionClass("Demi Lovato", "Confident",
                "38:59", 11, "Stone Cold",
                "3:11", R.drawable.confident_demi_lovato));
        music.add(new CompositionClass("Ariana Grande", "Dangerous Woman",
                "39:31", 11, "Dangerous Woman",
                "3:55", R.drawable.dangerous_woman_ariana_grande));
        music.add(new CompositionClass("Bone Thugs N Harmony", "BTNHResurrection",
                "75:53", 16, "Change The World",
                "4:31", R.drawable.btnhresurrection_bone_thugs));
        music.add(new CompositionClass("Pitbull", "Globalization",
                "38:48", 11, "Time of Our Lives",
                "3:49", R.drawable.globalization_pitbull));
        music.add(new CompositionClass("Britney Spears", "Glory",
                "41:26", 12, "Slumber Party",
                "3:34", R.drawable.glory_britney_spears));
        music.add(new CompositionClass("Selena Gomez", "Stars Dance",
                "38:59", 11, "Come & Get It",
                "3:51", R.drawable.stars_dance_selena_gomez));
        music.add(new CompositionClass("Predro Fernandez", "Aventurero",
                "43:56", 12, "Yo Soy El Aventurero",
                "3;00", R.drawable.aventurero_pedro_fernandez));
        music.add(new CompositionClass("Joan Sebastian", "Mas Alla Del Sol",
                "35:28", 12, "Eso Y Mas",
                "2:39", R.drawable.mas_alla_del_sol_joan_sebastian));

        return music;
    }
}