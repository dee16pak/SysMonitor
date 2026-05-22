# SysMonitor

SysMonitor is a lightweight Android application that brings Sysinternals-like system monitoring capabilities directly to your phone. Monitor processes, analyze file systems, inspect network connections, and gather system diagnostics—all without requiring root access.

## Features

### 📊 Process Monitoring
- View all running processes with real-time CPU and memory usage
- Display process details: PID, memory, threads, package name
- Terminate processes gracefully
- Process sorting and filtering

### 📁 File System Analysis
- Browse device file system with an intuitive interface
- View file properties: size, permissions, timestamps, owner
- Search files across directories
- Quick access to common directories (/sdcard, /data, etc.)

### 🌐 Network Monitoring
- List active network connections
- Monitor open ports and protocols
- Display connection statistics
- Real-time network activity tracking

### 🔧 System Diagnostics
- Device information (model, OS version, hardware specs)
- Performance metrics (RAM, storage, temperature if available)
- System logs and crash reports
- Battery information

### 🔍 SharedPreferences Inspector
- Inspect app data stored in SharedPreferences
- View system properties
- Package information and metadata

### 🛡️ VirusTotal Integration
- Scan files against VirusTotal database
- Verify app package hashes
- Get threat intelligence reports
- Safe file analysis without uploading suspicious files locally

## Tech Stack

- **Language**: Kotlin
- **UI Framework**: Jetpack Compose
- **Async Operations**: Coroutines & Flow
- **HTTP Client**: Retrofit
- **API Integration**: VirusTotal API v3
- **Minimum API**: 30 (Android 11+)
- **Target API**: 34+

## Project Structure

```
SysMonitor/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── kotlin/com/dee16pak/sysmonitor/
│   │   │   │   ├── ui/
│   │   │   │   ├── viewmodel/
│   │   │   │   ├── repository/
│   │   │   │   ├── data/
│   │   │   │   ├── utils/
│   │   │   │   ├── network/
│   │   │   │   └── MainActivity.kt
│   │   │   ├── AndroidManifest.xml
│   │   │   └── res/
│   │   └── test/
│   ├── build.gradle.kts
│   └── proguard-rules.pro
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

## Getting Started

### Prerequisites
- Android Studio Arctic Fox or later
- JDK 11+
- VirusTotal API key (optional, for full features)

### Installation

1. Clone the repository:
```bash
git clone https://github.com/dee16pak/SysMonitor.git
cd SysMonitor
```

2. Open in Android Studio and let it sync Gradle files.

3. Create `local.properties` and add your VirusTotal API key:
```properties
virustotal_api_key=YOUR_API_KEY_HERE
```

4. Build and run the app on your Android device (API 30+).

## Permissions Required

```xml
<uses-permission android:name="android.permission.INTERNET" />
<uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />
<uses-permission android:name="android.permission.QUERY_ALL_PACKAGES" />
```

## Usage

1. **Processes**: Launch the app → Navigate to "Processes" tab → View running apps and system processes
2. **Files**: Navigate to "Files" tab → Browse directories → View file details
3. **Network**: Navigate to "Network" tab → Monitor active connections
4. **System**: Navigate to "System" tab → View device info and diagnostics
5. **VirusTotal**: Navigate to "Security" tab → Scan files or app packages

## API Integration

### VirusTotal API
- Endpoint: `https://www.virustotal.com/api/v3/`
- Requires API key
- Rate limit: 4 requests/minute (free tier)

## Development Roadmap

- [x] Project setup
- [ ] Process monitoring core
- [ ] File system browser
- [ ] Network monitoring
- [ ] System diagnostics
- [ ] VirusTotal integration
- [ ] UI/UX polish
- [ ] Performance optimization
- [ ] Testing suite

## License

MIT License - See LICENSE file for details

## Contributing

Contributions are welcome! Please:
1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit changes (`git commit -m 'Add amazing feature'`)
4. Push to branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## Support

For issues, feature requests, or questions, please create an Issue on GitHub.

---

**Note**: This app does not require root access and operates within standard Android permissions and constraints.
