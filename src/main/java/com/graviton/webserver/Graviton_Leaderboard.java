package com.graviton.webserver;

import java.util.ArrayList;

public record Graviton_Leaderboard(long id, String content, ArrayList<Player_Data> pd) { }
