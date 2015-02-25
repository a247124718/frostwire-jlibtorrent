/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class stats_alert extends torrent_alert {
  private long swigCPtr;

  protected stats_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.stats_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(stats_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_stats_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public stats_alert(torrent_handle h, int interval, stat s) {
    this(libtorrent_jni.new_stats_alert(torrent_handle.getCPtr(h), h, interval, stat.getCPtr(s), s), true);
  }

  public int type() {
    return libtorrent_jni.stats_alert_type(swigCPtr, this);
  }

  public int category() {
    return libtorrent_jni.stats_alert_category(swigCPtr, this);
  }

  public String what() {
    return libtorrent_jni.stats_alert_what(swigCPtr, this);
  }

  public String message() {
    return libtorrent_jni.stats_alert_message(swigCPtr, this);
  }

  public void setInterval(int value) {
    libtorrent_jni.stats_alert_interval_set(swigCPtr, this, value);
  }

  public int getInterval() {
    return libtorrent_jni.stats_alert_interval_get(swigCPtr, this);
  }

  public int_vector transferred_v() {
    return new int_vector(libtorrent_jni.stats_alert_transferred_v(swigCPtr, this), true);
  }

  public final static int alert_type = libtorrent_jni.stats_alert_alert_type_get();
  public final static int static_category = libtorrent_jni.stats_alert_static_category_get();
  public enum stats_channel {
    upload_payload,
    upload_protocol,
    download_payload,
    download_protocol,
    upload_ip_protocol,
    upload_dht_protocol,
    upload_tracker_protocol,
    download_ip_protocol,
    download_dht_protocol,
    download_tracker_protocol,
    num_channels;

    public final int swigValue() {
      return swigValue;
    }

    public static stats_channel swigToEnum(int swigValue) {
      stats_channel[] swigValues = stats_channel.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (stats_channel swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + stats_channel.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private stats_channel() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private stats_channel(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private stats_channel(stats_channel swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
