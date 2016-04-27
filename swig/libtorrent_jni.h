/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * This file is not intended to be easily readable and contains a number of
 * coding conventions designed to improve portability and efficiency. Do not make
 * changes to this file unless you know what you are doing--modify the SWIG
 * interface file instead.
 * ----------------------------------------------------------------------------- */

#ifndef SWIG_libtorrent_WRAP_H_
#define SWIG_libtorrent_WRAP_H_

class SwigDirector_add_files_listener : public add_files_listener, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_add_files_listener(JNIEnv *jenv);
    virtual ~SwigDirector_add_files_listener();
    virtual bool pred(std::string const &p);
public:
    bool swig_overrides(int n) {
      return (n < 1 ? swig_override[n] : false);
    }
protected:
    Swig::BoolArray<1> swig_override;
};

class SwigDirector_set_piece_hashes_listener : public set_piece_hashes_listener, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_set_piece_hashes_listener(JNIEnv *jenv);
    virtual ~SwigDirector_set_piece_hashes_listener();
    virtual void progress(int i);
public:
    bool swig_overrides(int n) {
      return (n < 1 ? swig_override[n] : false);
    }
protected:
    Swig::BoolArray<1> swig_override;
};

class SwigDirector_dht_extension_handler_listener : public dht_extension_handler_listener, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_dht_extension_handler_listener(JNIEnv *jenv);
    virtual ~SwigDirector_dht_extension_handler_listener();
    virtual bool on_message(udp::endpoint const &source, libtorrent::bdecode_node const &request, libtorrent::entry &response);
public:
    bool swig_overrides(int n) {
      return (n < 1 ? swig_override[n] : false);
    }
protected:
    Swig::BoolArray<1> swig_override;
};

struct SwigDirector_swig_storage : public swig_storage, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_swig_storage(JNIEnv *jenv);
    virtual ~SwigDirector_swig_storage();
    virtual void set_params(libtorrent::storage_params const &params);
    virtual void initialize(libtorrent::storage_error &ec);
    virtual int read(boost::int64_t iov_base, size_t iov_len, int piece, int offset, int flags, libtorrent::storage_error &ec);
    virtual int write(boost::int64_t iov_base, size_t iov_len, int piece, int offset, int flags, libtorrent::storage_error &ec);
    virtual bool has_any_file(libtorrent::storage_error &ec);
    virtual void set_file_priority(std::vector< boost::uint8_t > const &prio, libtorrent::storage_error &ec);
    virtual int move_storage(std::string const &save_path, int flags, libtorrent::storage_error &ec);
    virtual bool verify_resume_data(libtorrent::add_torrent_params const &rd, std::vector< std::string > const *links, libtorrent::storage_error &ec);
    virtual void write_resume_data(libtorrent::entry &rd, libtorrent::storage_error &ec) const;
    virtual void release_files(libtorrent::storage_error &ec);
    virtual void rename_file(int index, std::string const &new_filename, libtorrent::storage_error &ec);
    virtual void delete_files(int options, libtorrent::storage_error &ec);
    virtual bool tick();
public:
    bool swig_overrides(int n) {
      return (n < 12 ? swig_override[n] : false);
    }
protected:
    Swig::BoolArray<12> swig_override;
};

struct SwigDirector_swig_dht_storage : public swig_dht_storage, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_swig_dht_storage(JNIEnv *jenv);
    virtual void set_params(libtorrent::sha1_hash const &id, libtorrent::dht_settings const &settings);
    virtual bool get_peers(libtorrent::sha1_hash const &info_hash, bool noseed, bool scrape, libtorrent::entry &peers) const;
    virtual void announce_peer(libtorrent::sha1_hash const &info_hash, tcp::endpoint const &endp, std::string const &name, bool seed);
    virtual bool get_immutable_item(libtorrent::sha1_hash const &target, libtorrent::entry &item) const;
    virtual void put_immutable_item(libtorrent::sha1_hash const &target, std::vector< int8_t > const &buf, libtorrent::address const &addr);
    virtual boost::int64_t get_mutable_item_seq_num(libtorrent::sha1_hash const &target) const;
    virtual bool get_mutable_item(libtorrent::sha1_hash const &target, boost::int64_t seq, bool force_fill, libtorrent::entry &item) const;
    virtual void put_mutable_item(libtorrent::sha1_hash const &target, std::vector< int8_t > const &buf, std::vector< int8_t > const &sig, boost::int64_t seq, std::vector< int8_t > const &pk, std::vector< int8_t > const &salt, libtorrent::address const &addr);
    virtual void tick();
    virtual swig_dht_storage_counters swig_counters() const;
    virtual ~SwigDirector_swig_dht_storage();
public:
    bool swig_overrides(int n) {
      return (n < 10 ? swig_override[n] : false);
    }
protected:
    Swig::BoolArray<10> swig_override;
};

struct SwigDirector_swig_plugin : public swig_plugin, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_swig_plugin(JNIEnv *jenv);
    virtual ~SwigDirector_swig_plugin();
    virtual void added(libtorrent::session_handle s);
    virtual void register_dht_extensions(std::vector< std::pair< std::string,dht_extension_handler_listener * > > &dht_extensions);
    virtual void on_alert(libtorrent::alert const *a);
    virtual bool on_unknown_torrent(libtorrent::sha1_hash const &info_hash, libtorrent::peer_connection_handle const &pc, libtorrent::add_torrent_params &p);
    virtual void on_tick();
    virtual void save_state(libtorrent::entry &e) const;
    virtual void load_state(libtorrent::bdecode_node const &n);
public:
    bool swig_overrides(int n) {
      return (n < 7 ? swig_override[n] : false);
    }
protected:
    Swig::BoolArray<7> swig_override;
};

struct SwigDirector_swig_torrent_plugin : public swig_torrent_plugin, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_swig_torrent_plugin(JNIEnv *jenv);
    virtual ~SwigDirector_swig_torrent_plugin();
    virtual void on_piece_pass(int index);
    virtual void on_piece_failed(int index);
    virtual void tick();
    virtual bool on_pause();
    virtual bool on_resume();
    virtual void on_files_checked();
    virtual void on_state(int s);
    virtual void on_unload();
    virtual void on_load();
    virtual void on_add_peer(tcp::endpoint const &endp, int src, int flags);
public:
    bool swig_overrides(int n) {
      return (n < 10 ? swig_override[n] : false);
    }
protected:
    Swig::BoolArray<10> swig_override;
};

struct SwigDirector_swig_peer_plugin : public swig_peer_plugin, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_swig_peer_plugin(JNIEnv *jenv);
    virtual ~SwigDirector_swig_peer_plugin();
    virtual void add_handshake(libtorrent::entry &e);
    virtual void on_disconnect(boost::system::error_code const &ec);
    virtual void on_connected();
    virtual bool on_handshake(char const *reserved_bits);
    virtual bool on_extension_handshake(libtorrent::bdecode_node const &n);
    virtual bool on_choke();
    virtual bool on_unchoke();
    virtual bool on_interested();
    virtual bool on_not_interested();
    virtual bool on_have(int index);
    virtual bool on_dont_have(int index);
    virtual bool on_bitfield(libtorrent::bitfield const &bitfield);
    virtual bool on_have_all();
    virtual bool on_have_none();
    virtual bool on_allowed_fast(int index);
    virtual bool on_request(libtorrent::peer_request const &r);
    virtual bool on_piece(libtorrent::peer_request const &piece, libtorrent::disk_buffer_holder &data);
    virtual bool on_cancel(libtorrent::peer_request const &r);
    virtual bool on_reject(libtorrent::peer_request const &r);
    virtual bool on_suggest(int index);
    virtual void sent_unchoke();
    virtual void sent_payload(int bytes);
    virtual bool can_disconnect(boost::system::error_code const &ec);
    virtual void on_piece_pass(int index);
    virtual void on_piece_failed(int index);
    virtual void tick();
    virtual bool write_request(libtorrent::peer_request const &r);
public:
    bool swig_overrides(int n) {
      return (n < 27 ? swig_override[n] : false);
    }
protected:
    Swig::BoolArray<27> swig_override;
};

class SwigDirector_posix_wrapper : public posix_wrapper, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_posix_wrapper(JNIEnv *jenv);
    virtual ~SwigDirector_posix_wrapper();
    virtual int open(char const *path, int flags, int mode);
    virtual int stat(char const *path, posix_stat *buf);
    virtual int mkdir(char const *path, int mode);
    virtual int rename(char const *oldpath, char const *newpath);
    virtual int remove(char const *path);
public:
    bool swig_overrides(int n) {
      return (n < 5 ? swig_override[n] : false);
    }
protected:
    Swig::BoolArray<5> swig_override;
};


#endif
