// Write your JavaScript code.

let viewerApp;
const options = {
    env: 'AutodeskProduction',
    accessToken: '<YOUR_ACCESS_TOKEN>'
};
const documentId = 'urn:<YOUR_URN>';

Autodesk.Viewing.Initializer(options, function() {
  viewerApp = new Autodesk.Viewing.ViewingApplication( 'viewer' );
  viewerApp.registerViewer( viewerApp.k3D, Autodesk.Viewing.Private.GuiViewer3D );
  viewerApp.loadDocument( documentId, onDocumentLoadSuccess, onDocumentLoadFailure );
});
  
function onDocumentLoadSuccess( doc ) {
  const viewables = viewerApp.bubble.search({
    'type': 'geometry',
    'role': '3d'
  });

  if( viewables.length === 0 ) {
    console.error( 'Document contains no viewables.' );
    return;
  }

  // Choose any of the avialble viewables
  viewerApp.selectItem( viewables[0].data, onItemLoadSuccess, onItemLoadFail );
}

function onDocumentLoadFailure( viewerErrorCode ) {
  console.error( 'onDocumentLoadFailure() - errorCode:' + viewerErrorCode );
}

function onItemLoadSuccess( viewer, item ) {
  console.log( 'onItemLoadSuccess()!' );
}

function onItemLoadFail( errorCode ) {
  console.error( 'onItemLoadFail() - errorCode:' + errorCode );
}