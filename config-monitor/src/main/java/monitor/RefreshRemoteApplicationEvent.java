package monitor;

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
