package com.cph.oppencraft.block;

public class NukeStandUtils {
  public static String generateNukeStandModel(String woodType, String woodNamespace) {
    return "{\n" +
                   "  \"parent\": \"oppencraft:block/nuke_stand\",\n" +
                   "  \"textures\": {\n" +
                   "    \"0\": \"" + woodNamespace + ":block/" + woodType + "\"\n" +
                   "    \"particle\": \"" + woodNamespace + ":block/" + woodType + "\"\n" +
                   "  }\n" +
                   "}";
  }
}