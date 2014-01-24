package org.robolectric.res;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ActivityData {
  public static final String NAME_ATTR = "android:name";
  public static final String LABEL_ATTR = "android:label";
  public static final String THEME_ATTR = "android:theme";
  public static final String TASK_AFFINITY_ATTR = "android:taskAffinity";

  private final List<IntentFilterData> intentFilters;
  private final HashMap<String, String> attrs;

  public ActivityData(Map<String, String> attrMap, List<IntentFilterData> intentFilters) {
    attrs = new HashMap<String,String>();
    attrs.putAll(attrMap);
    this.intentFilters = new ArrayList<IntentFilterData>(intentFilters);
  }

  /**
   * Convenience accessor for value of android:name attribute.
   */
  public String getName() {
    return attrs.get(NAME_ATTR);
  }

  /**
   * Convenience accessor for value of android:label attribute.
   */
  public String getLabel() {
    return attrs.get(LABEL_ATTR);
  }

  /**
   * Convenience accessor for value of android:theme attribute.
   */
  public String getThemeRef() {
    return attrs.get(THEME_ATTR);
  }

  /**
   * Convenience accessor for value of android:taskAffinity attribute.
   */
  public String getTaskAffinity() {
    return attrs.get(TASK_AFFINITY_ATTR);
  }

  /**
   * Get the map for all attributes defined for the activity XML.
   * @return map of attributes names to values from the manifest. Not null.
   */
  public Map<String, String> getAllAttributes() {
    return attrs;
  }

  /**
   * Get the intent filters defined for activity.
   * @return A list of intent filters. Not null.
   */
  public List<IntentFilterData> getIntentFilters() {
    return intentFilters;
  }
}
