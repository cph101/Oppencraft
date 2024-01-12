package com.cph.oppencraft.block.nuke_stand;

public class NukeStandUtils {
  public static String generateNukeStandModel(String woodType, String woodNamespace) {
    return "{\n" +
                   "  \"parent\": \"oppencraft:block/nuke_stand\",\n" +
                   "  \"textures\": {\n" +
                   "    \"0\": \"" + woodNamespace + ":block/" + woodType + ",\"\n" +
                   "    \"particle\": \"" + woodNamespace + ":block/" + woodType + "\"\n" +
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
}