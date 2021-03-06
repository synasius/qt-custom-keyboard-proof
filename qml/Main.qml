import VPlayApps 1.0
import QtQuick 2.0

App {
    // You get free licenseKeys from http://v-play.net/licenseKey
    // With a licenseKey you can:
    //  * Publish your games & apps for the app stores
    //  * Remove the V-Play Splash Screen or set a custom one (available with the Pro Licenses)
    //  * Add plugins to monetize, analyze & improve your apps (available with the Pro Licenses)
    licenseKey: "C077B2E0EFA00094B07077D80155267D410022C782A8BD3D361B47D2476C0A01A07592013D0F8A5A1DA0C1904552E1A4D7F782B4BC0EAB11D7267E1F38EBACD53F2D24F31100924EB5CE3D89016F318131F1F8A4D1C1AC03CEA284AE9EE6DAB9B95933381F7317F4591C77DFA5CF2CCF7F32A040FB347E7659C537041FA517F067C80730E85572B21C6E59C8CBBA8D25F5A1F740207240AC33EAE588CDD47C6193AD1E340DEA983108278F597BBF712673368A3BE35305DB28B08414B5D5B2756E4BD5808CD5913CB3EB05C03F9B76B75552308997EA3EEA7C081DA44E0DB678C743971C7F5B20A0FDA938DAF29002C41B319C6BBB1785C83ED81E3B1FD15B17FC094A295598B80C752C32821E411E493BFE26952A54D691E694EB6AB2441F87"

    NavigationStack {

        Page {
            title: qsTr("Main Page")

            Image {
                source: "../assets/vplay-logo.png"
                anchors.centerIn: parent

                MouseArea {
                    anchors.fill: parent
                    onClicked: shareIntent.share("Foo", "Foo subject", "Hello World!")
                }
            }
        }

    }
}

