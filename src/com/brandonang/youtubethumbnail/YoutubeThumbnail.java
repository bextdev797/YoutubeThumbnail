package com.brandonang.youtubethumbnail;

import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;

public class YoutubeThumbnail extends AndroidNonvisibleComponent {

  public YoutubeThumbnail(ComponentContainer container) {
    super(container.$form());
  }

  @SimpleFunction
  public String GetYoutubeThumbnail(String videoID, String quality){
    if(quality.equals("Large")){
      String largeThumbnail = "https://i3.ytimg.com/vi/" + videoID + "/maxresdefault.jpg";
      return largeThumbnail;
    } else if(quality.equals("Medium")){
      String mediumThumbnail = "https://i3.ytimg.com/vi/" + videoID + "/mqdefault.jpg";
      return mediumThumbnail;
    } else if(quality.equals("Small")){
      String smallThumbnail = "https://i3.ytimg.com/vi/" + videoID + "/default.jpg";
      return smallThumbnail;
    }
    return "";
  }

  @SimpleFunction
  public String Large(){
    return "Large";
  }

  @SimpleFunction
  public String Medium(){
    return "Medium";
  }

  @SimpleFunction
  public String Small(){
    return "Small";
  }
}