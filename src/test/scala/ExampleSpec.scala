import com.jcraft.jsch.ChannelSftp
import org.scalatest.mockito.MockitoSugar
import org.scalatest.{Matchers, WordSpec}

class ExampleSpec extends WordSpec with MockitoSugar with Matchers {

  "Mockito" should {

    "allow creating mocks for ChannelSftp" in {
      val mockChannelSftp: ChannelSftp = mock[ChannelSftp]
    }
  }
}
