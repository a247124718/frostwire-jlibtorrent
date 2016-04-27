/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class alert {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected alert(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public int type() {
    return libtorrent_jni.alert_type(swigCPtr, this);
  }

  public String what() {
    return libtorrent_jni.alert_what(swigCPtr, this);
  }

  public String message() {
    return libtorrent_jni.alert_message(swigCPtr, this);
  }

  public int category() {
    return libtorrent_jni.alert_category(swigCPtr, this);
  }

  public static torrent_alert cast_to_torrent_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_torrent_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new torrent_alert(cPtr, false);
  }

  public static peer_alert cast_to_peer_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_peer_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new peer_alert(cPtr, false);
  }

  public static tracker_alert cast_to_tracker_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_tracker_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new tracker_alert(cPtr, false);
  }

  public static torrent_added_alert cast_to_torrent_added_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_torrent_added_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new torrent_added_alert(cPtr, false);
  }

  public static torrent_removed_alert cast_to_torrent_removed_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_torrent_removed_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new torrent_removed_alert(cPtr, false);
  }

  public static read_piece_alert cast_to_read_piece_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_read_piece_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new read_piece_alert(cPtr, false);
  }

  public static file_completed_alert cast_to_file_completed_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_file_completed_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new file_completed_alert(cPtr, false);
  }

  public static file_renamed_alert cast_to_file_renamed_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_file_renamed_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new file_renamed_alert(cPtr, false);
  }

  public static file_rename_failed_alert cast_to_file_rename_failed_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_file_rename_failed_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new file_rename_failed_alert(cPtr, false);
  }

  public static performance_alert cast_to_performance_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_performance_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new performance_alert(cPtr, false);
  }

  public static state_changed_alert cast_to_state_changed_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_state_changed_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new state_changed_alert(cPtr, false);
  }

  public static tracker_error_alert cast_to_tracker_error_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_tracker_error_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new tracker_error_alert(cPtr, false);
  }

  public static tracker_warning_alert cast_to_tracker_warning_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_tracker_warning_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new tracker_warning_alert(cPtr, false);
  }

  public static scrape_reply_alert cast_to_scrape_reply_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_scrape_reply_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new scrape_reply_alert(cPtr, false);
  }

  public static scrape_failed_alert cast_to_scrape_failed_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_scrape_failed_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new scrape_failed_alert(cPtr, false);
  }

  public static tracker_reply_alert cast_to_tracker_reply_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_tracker_reply_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new tracker_reply_alert(cPtr, false);
  }

  public static dht_reply_alert cast_to_dht_reply_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_dht_reply_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new dht_reply_alert(cPtr, false);
  }

  public static tracker_announce_alert cast_to_tracker_announce_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_tracker_announce_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new tracker_announce_alert(cPtr, false);
  }

  public static hash_failed_alert cast_to_hash_failed_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_hash_failed_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new hash_failed_alert(cPtr, false);
  }

  public static peer_ban_alert cast_to_peer_ban_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_peer_ban_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new peer_ban_alert(cPtr, false);
  }

  public static peer_unsnubbed_alert cast_to_peer_unsnubbed_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_peer_unsnubbed_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new peer_unsnubbed_alert(cPtr, false);
  }

  public static peer_snubbed_alert cast_to_peer_snubbed_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_peer_snubbed_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new peer_snubbed_alert(cPtr, false);
  }

  public static peer_error_alert cast_to_peer_error_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_peer_error_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new peer_error_alert(cPtr, false);
  }

  public static peer_connect_alert cast_to_peer_connect_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_peer_connect_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new peer_connect_alert(cPtr, false);
  }

  public static peer_disconnected_alert cast_to_peer_disconnected_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_peer_disconnected_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new peer_disconnected_alert(cPtr, false);
  }

  public static invalid_request_alert cast_to_invalid_request_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_invalid_request_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new invalid_request_alert(cPtr, false);
  }

  public static torrent_finished_alert cast_to_torrent_finished_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_torrent_finished_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new torrent_finished_alert(cPtr, false);
  }

  public static piece_finished_alert cast_to_piece_finished_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_piece_finished_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new piece_finished_alert(cPtr, false);
  }

  public static request_dropped_alert cast_to_request_dropped_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_request_dropped_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new request_dropped_alert(cPtr, false);
  }

  public static block_timeout_alert cast_to_block_timeout_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_block_timeout_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new block_timeout_alert(cPtr, false);
  }

  public static block_finished_alert cast_to_block_finished_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_block_finished_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new block_finished_alert(cPtr, false);
  }

  public static block_downloading_alert cast_to_block_downloading_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_block_downloading_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new block_downloading_alert(cPtr, false);
  }

  public static unwanted_block_alert cast_to_unwanted_block_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_unwanted_block_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new unwanted_block_alert(cPtr, false);
  }

  public static storage_moved_alert cast_to_storage_moved_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_storage_moved_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new storage_moved_alert(cPtr, false);
  }

  public static storage_moved_failed_alert cast_to_storage_moved_failed_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_storage_moved_failed_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new storage_moved_failed_alert(cPtr, false);
  }

  public static torrent_deleted_alert cast_to_torrent_deleted_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_torrent_deleted_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new torrent_deleted_alert(cPtr, false);
  }

  public static torrent_delete_failed_alert cast_to_torrent_delete_failed_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_torrent_delete_failed_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new torrent_delete_failed_alert(cPtr, false);
  }

  public static save_resume_data_alert cast_to_save_resume_data_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_save_resume_data_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new save_resume_data_alert(cPtr, false);
  }

  public static save_resume_data_failed_alert cast_to_save_resume_data_failed_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_save_resume_data_failed_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new save_resume_data_failed_alert(cPtr, false);
  }

  public static torrent_paused_alert cast_to_torrent_paused_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_torrent_paused_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new torrent_paused_alert(cPtr, false);
  }

  public static torrent_resumed_alert cast_to_torrent_resumed_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_torrent_resumed_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new torrent_resumed_alert(cPtr, false);
  }

  public static torrent_checked_alert cast_to_torrent_checked_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_torrent_checked_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new torrent_checked_alert(cPtr, false);
  }

  public static url_seed_alert cast_to_url_seed_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_url_seed_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new url_seed_alert(cPtr, false);
  }

  public static file_error_alert cast_to_file_error_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_file_error_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new file_error_alert(cPtr, false);
  }

  public static metadata_failed_alert cast_to_metadata_failed_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_metadata_failed_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new metadata_failed_alert(cPtr, false);
  }

  public static metadata_received_alert cast_to_metadata_received_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_metadata_received_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new metadata_received_alert(cPtr, false);
  }

  public static udp_error_alert cast_to_udp_error_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_udp_error_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new udp_error_alert(cPtr, false);
  }

  public static external_ip_alert cast_to_external_ip_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_external_ip_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new external_ip_alert(cPtr, false);
  }

  public static listen_failed_alert cast_to_listen_failed_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_listen_failed_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new listen_failed_alert(cPtr, false);
  }

  public static listen_succeeded_alert cast_to_listen_succeeded_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_listen_succeeded_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new listen_succeeded_alert(cPtr, false);
  }

  public static portmap_error_alert cast_to_portmap_error_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_portmap_error_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new portmap_error_alert(cPtr, false);
  }

  public static portmap_alert cast_to_portmap_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_portmap_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new portmap_alert(cPtr, false);
  }

  public static portmap_log_alert cast_to_portmap_log_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_portmap_log_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new portmap_log_alert(cPtr, false);
  }

  public static fastresume_rejected_alert cast_to_fastresume_rejected_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_fastresume_rejected_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new fastresume_rejected_alert(cPtr, false);
  }

  public static peer_blocked_alert cast_to_peer_blocked_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_peer_blocked_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new peer_blocked_alert(cPtr, false);
  }

  public static dht_announce_alert cast_to_dht_announce_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_dht_announce_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new dht_announce_alert(cPtr, false);
  }

  public static dht_get_peers_alert cast_to_dht_get_peers_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_dht_get_peers_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new dht_get_peers_alert(cPtr, false);
  }

  public static stats_alert cast_to_stats_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_stats_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new stats_alert(cPtr, false);
  }

  public static cache_flushed_alert cast_to_cache_flushed_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_cache_flushed_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new cache_flushed_alert(cPtr, false);
  }

  public static anonymous_mode_alert cast_to_anonymous_mode_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_anonymous_mode_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new anonymous_mode_alert(cPtr, false);
  }

  public static lsd_peer_alert cast_to_lsd_peer_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_lsd_peer_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new lsd_peer_alert(cPtr, false);
  }

  public static trackerid_alert cast_to_trackerid_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_trackerid_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new trackerid_alert(cPtr, false);
  }

  public static dht_bootstrap_alert cast_to_dht_bootstrap_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_dht_bootstrap_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new dht_bootstrap_alert(cPtr, false);
  }

  public static torrent_error_alert cast_to_torrent_error_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_torrent_error_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new torrent_error_alert(cPtr, false);
  }

  public static torrent_need_cert_alert cast_to_torrent_need_cert_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_torrent_need_cert_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new torrent_need_cert_alert(cPtr, false);
  }

  public static incoming_connection_alert cast_to_incoming_connection_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_incoming_connection_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new incoming_connection_alert(cPtr, false);
  }

  public static add_torrent_alert cast_to_add_torrent_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_add_torrent_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new add_torrent_alert(cPtr, false);
  }

  public static state_update_alert cast_to_state_update_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_state_update_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new state_update_alert(cPtr, false);
  }

  public static mmap_cache_alert cast_to_mmap_cache_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_mmap_cache_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new mmap_cache_alert(cPtr, false);
  }

  public static session_stats_alert cast_to_session_stats_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_session_stats_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new session_stats_alert(cPtr, false);
  }

  public static dht_error_alert cast_to_dht_error_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_dht_error_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new dht_error_alert(cPtr, false);
  }

  public static dht_immutable_item_alert cast_to_dht_immutable_item_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_dht_immutable_item_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new dht_immutable_item_alert(cPtr, false);
  }

  public static dht_mutable_item_alert cast_to_dht_mutable_item_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_dht_mutable_item_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new dht_mutable_item_alert(cPtr, false);
  }

  public static dht_put_alert cast_to_dht_put_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_dht_put_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new dht_put_alert(cPtr, false);
  }

  public static i2p_alert cast_to_i2p_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_i2p_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new i2p_alert(cPtr, false);
  }

  public static dht_outgoing_get_peers_alert cast_to_dht_outgoing_get_peers_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_dht_outgoing_get_peers_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new dht_outgoing_get_peers_alert(cPtr, false);
  }

  public static log_alert cast_to_log_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_log_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new log_alert(cPtr, false);
  }

  public static torrent_log_alert cast_to_torrent_log_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_torrent_log_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new torrent_log_alert(cPtr, false);
  }

  public static peer_log_alert cast_to_peer_log_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_peer_log_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new peer_log_alert(cPtr, false);
  }

  public static lsd_error_alert cast_to_lsd_error_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_lsd_error_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new lsd_error_alert(cPtr, false);
  }

  public static dht_stats_alert cast_to_dht_stats_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_dht_stats_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new dht_stats_alert(cPtr, false);
  }

  public static incoming_request_alert cast_to_incoming_request_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_incoming_request_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new incoming_request_alert(cPtr, false);
  }

  public static dht_log_alert cast_to_dht_log_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_dht_log_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new dht_log_alert(cPtr, false);
  }

  public static dht_pkt_alert cast_to_dht_pkt_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_dht_pkt_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new dht_pkt_alert(cPtr, false);
  }

  public static dht_get_peers_reply_alert cast_to_dht_get_peers_reply_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_dht_get_peers_reply_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new dht_get_peers_reply_alert(cPtr, false);
  }

  public static dht_direct_response_alert cast_to_dht_direct_response_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_dht_direct_response_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new dht_direct_response_alert(cPtr, false);
  }

  public static picker_log_alert cast_to_picker_log_alert(alert a) {
    long cPtr = libtorrent_jni.alert_cast_to_picker_log_alert(alert.getCPtr(a), a);
    return (cPtr == 0) ? null : new picker_log_alert(cPtr, false);
  }

  public long get_timestamp() {
    return libtorrent_jni.alert_get_timestamp(swigCPtr, this);
  }

  public final static class category_t {
    public final static alert.category_t error_notification = new alert.category_t("error_notification", libtorrent_jni.alert_error_notification_get());
    public final static alert.category_t peer_notification = new alert.category_t("peer_notification", libtorrent_jni.alert_peer_notification_get());
    public final static alert.category_t port_mapping_notification = new alert.category_t("port_mapping_notification", libtorrent_jni.alert_port_mapping_notification_get());
    public final static alert.category_t storage_notification = new alert.category_t("storage_notification", libtorrent_jni.alert_storage_notification_get());
    public final static alert.category_t tracker_notification = new alert.category_t("tracker_notification", libtorrent_jni.alert_tracker_notification_get());
    public final static alert.category_t debug_notification = new alert.category_t("debug_notification", libtorrent_jni.alert_debug_notification_get());
    public final static alert.category_t status_notification = new alert.category_t("status_notification", libtorrent_jni.alert_status_notification_get());
    public final static alert.category_t progress_notification = new alert.category_t("progress_notification", libtorrent_jni.alert_progress_notification_get());
    public final static alert.category_t ip_block_notification = new alert.category_t("ip_block_notification", libtorrent_jni.alert_ip_block_notification_get());
    public final static alert.category_t performance_warning = new alert.category_t("performance_warning", libtorrent_jni.alert_performance_warning_get());
    public final static alert.category_t dht_notification = new alert.category_t("dht_notification", libtorrent_jni.alert_dht_notification_get());
    public final static alert.category_t stats_notification = new alert.category_t("stats_notification", libtorrent_jni.alert_stats_notification_get());
    public final static alert.category_t session_log_notification = new alert.category_t("session_log_notification", libtorrent_jni.alert_session_log_notification_get());
    public final static alert.category_t torrent_log_notification = new alert.category_t("torrent_log_notification", libtorrent_jni.alert_torrent_log_notification_get());
    public final static alert.category_t peer_log_notification = new alert.category_t("peer_log_notification", libtorrent_jni.alert_peer_log_notification_get());
    public final static alert.category_t incoming_request_notification = new alert.category_t("incoming_request_notification", libtorrent_jni.alert_incoming_request_notification_get());
    public final static alert.category_t dht_log_notification = new alert.category_t("dht_log_notification", libtorrent_jni.alert_dht_log_notification_get());
    public final static alert.category_t dht_operation_notification = new alert.category_t("dht_operation_notification", libtorrent_jni.alert_dht_operation_notification_get());
    public final static alert.category_t port_mapping_log_notification = new alert.category_t("port_mapping_log_notification", libtorrent_jni.alert_port_mapping_log_notification_get());
    public final static alert.category_t picker_log_notification = new alert.category_t("picker_log_notification", libtorrent_jni.alert_picker_log_notification_get());
    public final static alert.category_t all_categories = new alert.category_t("all_categories", libtorrent_jni.alert_all_categories_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static category_t swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + category_t.class + " with value " + swigValue);
    }

    private category_t(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private category_t(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private category_t(String swigName, category_t swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static category_t[] swigValues = { error_notification, peer_notification, port_mapping_notification, storage_notification, tracker_notification, debug_notification, status_notification, progress_notification, ip_block_notification, performance_warning, dht_notification, stats_notification, session_log_notification, torrent_log_notification, peer_log_notification, incoming_request_notification, dht_log_notification, dht_operation_notification, port_mapping_log_notification, picker_log_notification, all_categories };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
