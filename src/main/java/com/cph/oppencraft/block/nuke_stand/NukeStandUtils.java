package com.cph.oppencraft.block.nuke_stand;

public class NukeStandUtils {
  public static String generateNukeStandBlockModel(String woodType, String woodNamespace) {
    return "{\n" +
                   "  \"parent\": \"oppencraft:block/nuke_stand\",\n" +
                   "  \"textures\": {\n" +
                   "    \"0\": \"" + woodNamespace + ":block/" + woodType + "_planks\",\n" +
                   "    \"particle\": \"" + woodNamespace + ":block/" + woodType + "_planks\"\n" +
                   "  }\n" +
                   "}";
  }

  public static String generateNukeStandItemModel(String woodType, String woodNamespace) {
    return "{\n" +
            "  \"parent\": \"oppencraft:item/nuke_stand\",\n" +
            "  \"textures\": {\n" +
            "    \"0\": \"" + woodNamespace + ":block/" + woodType + "_planks\",\n" +
            "    \"particle\": \"" + woodNamespace + ":block/" + woodType + "_planks\"\n" +
            "  }\n" +
            "}";
  }

  public static String generateBlockstates(String woodType, String namespace) {
    return "{\n" +
            "  \"variants\": {\n" +
            "    \"facing=north\": {\"model\": \"" + namespace + ":block/nuke_stand_" + woodType + "\", \"uvlock\": true},\n" +
            "    \"facing=east\":  {\"model\": \"" + namespace + ":block/nuke_stand_" + woodType + "\", \"y\":  90, \"uvlock\": true},\n" +
            "    \"facing=south\": {\"model\": \"" + namespace + ":block/nuke_stand_" + woodType + "\", \"y\": 0, \"uvlock\": true},\n" +
            "    \"facing=west\":  {\"model\": \"" + namespace + ":block/nuke_stand_" + woodType + "\", \"y\": 90, \"uvlock\": true}\n" +
            "  }\n" +
            "}";
  }

  public static String capitalizeEveryWord(String str){
    String[] words =str.split("\\s");
    StringBuilder capitalizeWord= new StringBuilder();
    for(String w:words){
      String first=w.substring(0,1);
      String afterfirst=w.substring(1);
      capitalizeWord.append(first.toUpperCase()).append(afterfirst).append(" ");
    }
    return capitalizeWord.toString().trim();
  }
}