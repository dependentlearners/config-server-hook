package gaddam1987.github.config.monitor;

import org.springframework.context.ApplicationEvent;

/**
 * Created by Naresh Reddy on 02/02/2017.
 */
@SuppressWarnings("serial")
public class RefreshRemoteApplicationEvent extends RemoteApplicationEvent {

    @SuppressWarnings("unused")
    private RefreshRemoteApplicationEvent() {
        // for serializers
    }

    public RefreshRemoteApplicationEvent(Object source, String originService,
                                         String destinationService) {
        super(source, originService, destinationService);
    }
}
