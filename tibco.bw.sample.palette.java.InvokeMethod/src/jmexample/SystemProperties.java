package jmexample;

// Copyright 2003 - TIBCO Software Inc.
// ALL RIGHTS RESERVED

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * This class makes available well defined java system properties and the host name and address.
 */
@SuppressWarnings("serial")
public class SystemProperties implements java.io.Serializable {

    public String java_version;                  // Java Runtime Environment version
    public String java_vendor;                   // Java Runtime Environment vendor
    public String java_vendor_url;               // Java vendor URL
    public String java_home;                     // Java installation directory
    public String java_vm_specification_version; // Java Virtual Machine specification version
    public String java_vm_specification_vendor;  // Java Virtual Machine specification vendor
    public String java_vm_specification_name;    // Java Virtual Machine specification name
    public String java_vm_version;               // Java Virtual Machine implementation version
    public String java_vm_vendor;                // Java Virtual Machine implementation vendor
    public String java_vm_name;                  // Java Virtual Machine implementation name
    public String java_specification_version;    // Java Runtime Environment specification version
    public String java_specification_vendor;     // Java Runtime Environment specification vendor
    public String java_specification_name;       // Java Runtime Environment specification name
    public String java_class_version;            // Java class format version number
    public String java_class_path;               // Java class path
    public String java_library_path;             // List of paths to search when loading libraries
    public String java_io_tmpdir;                // Default temp file path
    public String java_compiler;                 // Name of JIT compiler to use
    public String java_ext_dirs;                 // Path of extension directory or directories
    public String os_name;                       // Operating system name
    public String os_arch;                       // Operating system architecture
    public String os_version;                    // Operating system version
    public String file_separator;                // File separator ("/" on UNIX)
    public String path_separator;                // Path separator (":" on UNIX)
    public String line_separator;                // Line separator ("\n" on UNIX)
    public String user_name;                     // User's account name
    public String user_home;                     // User's home directory
    public String user_dir;                      // User's current working directory
    public String host_address;                  // Host IP address
    public String host_name;                     // Host Name


    /**
     * Constructor.
     */
    public SystemProperties() {
        this.java_version = System.getProperty("java.version");
        this.java_vendor = System.getProperty("java.vendor");
        this.java_vendor_url = System.getProperty("java.vendor.url");
        this.java_home = System.getProperty("java.home");
        this.java_vm_specification_version = System.getProperty("java.vm.specification.version");
        this.java_vm_specification_vendor = System.getProperty("java.vm.specification.vendor");
        this.java_vm_specification_name = System.getProperty("java.vm.specification.name");
        this.java_vm_version = System.getProperty("java.vm.version");
        this.java_vm_vendor = System.getProperty("java.vm.vendor");
        this.java_vm_name = System.getProperty("java.vm.name");
        this.java_specification_version = System.getProperty("java.specification.version");
        this.java_specification_vendor = System.getProperty("java.specification.vendor");
        this.java_specification_name = System.getProperty("java.specification.name");
        this.java_class_version = System.getProperty("java.class.version");
        this.java_class_path = System.getProperty("java.class.path");
        this.java_library_path = System.getProperty("java.library.path");
        this.java_io_tmpdir = System.getProperty("java.io.tmpdir");
        this.java_compiler = System.getProperty("java.compiler");
        this.java_ext_dirs = System.getProperty("java.ext.dirs");
        this.os_name = System.getProperty("os.name");
        this.os_arch = System.getProperty("os.arch");
        this.os_version = System.getProperty("os.version");
        this.file_separator = System.getProperty("file.separator");
        this.path_separator = System.getProperty("path.separator");
        this.line_separator = System.getProperty("line.separator");
        this.user_name = System.getProperty("user.name");
        this.user_home = System.getProperty("user.home");
        this.user_dir = System.getProperty("user.dir");
        try {
            InetAddress localAddr = InetAddress.getLocalHost();
            this.host_address = localAddr.getHostAddress();
            this.host_name = localAddr.getHostName();
        } catch (UnknownHostException e) {
        }

    }


}
