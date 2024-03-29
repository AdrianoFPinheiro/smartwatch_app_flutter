package br.com.adrianofpinheiro.smartwatch_app_flutter

import android.os.Bundle

import io.flutter.app.FlutterActivity
import io.flutter.plugins.GeneratedPluginRegistrant
import android.support.wear.ambient.AmbientMode


class MainActivity: FlutterActivity(), AmbientMode.AmbientCallbackProvider {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    GeneratedPluginRegistrant.registerWith(this)

    // Wire up the activity for ambient callbacks
    AmbientMode.attachAmbientSupport(this)
  }

  override fun getAmbientCallback(): AmbientMode.AmbientCallback {
    return FlutterAmbientCallback(getChannel(flutterView))
  }
}
w