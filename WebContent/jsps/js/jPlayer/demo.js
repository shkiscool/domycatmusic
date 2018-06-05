$(document).ready(function(){

//从数据库获取歌曲信息,现在还是测试的不变内容

  var myPlaylist = new jPlayerPlaylist({
    jPlayer: "#jplayer_N",
    cssSelectorAncestor: "#jp_container_N"
  }, [
    {

      title:"心术",
      artist:"张宇",
      mp3:"http://fs.w.kugou.com/201806031614/3d840a2459ed89faaffc7f9ecc5aedb2/G003/M08/05/05/Qw0DAFS8cSqAdyH8AETQCwB9kSw154.mp3",
      poster: "images/m0.jpg"
    },
    {
      title:"FriendShips",
      artist:"无",
      mp3:"http://fs.w.kugou.com/201806031633/07430098461d27ecc241e1da53ae2ec3/G130/M09/16/03/wg0DAFrs3XmAC0aCADe27Sf8ONw521.mp3",
      poster: "images/m0.jpg"
    },
    {
      title:"告白气球",
      artist:"周杰伦",
      mp3:"http://fs.w.kugou.com/201806031625/6281176f0b880e5f411613ae7cde7617/G059/M02/17/1D/ew0DAFdr9KmAf5GnADSkTnjFCm0437.mp3",
      poster: "images/m0.jpg"
    },
    {
      title:"三百六十五里路",
      artist:"黄文章",
      mp3:"http://fs.w.kugou.com/201806031558/8e1eac0b8433dfd1baf2f07100e5a3c9/G010/M04/03/01/Sg0DAFUXxk2AcnZ9AEb77HCHnUU456.mp3",
      poster: "images/m0.jpg"
    },
    {
      title:"不仅仅是喜欢",
      artist:"孙语赛 萧泉",
      mp3:"http://fs.w.kugou.com/201806031620/b48bd7eb318b650710f5e01ce018ac1b/G128/M02/0C/1B/IIcBAFqeIOuATRs5ADfTGednFp0404.mp3",
      poster: "images/m0.jpg"
    },
    {
      title:"广东爱情故事",
      artist:"广东雨神",
      mp3:"http://fs.w.kugou.com/201806031550/110f46823211ee1e38f9e97fde1825bb/G114/M0B/00/13/UpQEAFnocumANGxzADRUF4h4Zks442.mp3",
      poster: "images/m0.jpg"
    },
    {
      title:"空空如也-live",
      artist:"汪峰",
      mp3:"http://fs.w.kugou.com/201806031635/4e94932aa6ddd27bc74dc8c0de052605/G133/M06/1F/05/ZZQEAFq-OJeAZlHTAEiUY5VyLcI653.mp3",
      poster: "images/m0.jpg"
    }
  ], {
    playlistOptions: {
      enableRemoveControls: true,
      autoPlay: true
    },
    swfPath: "js/jPlayer",
    supplied: "webmv, ogv, m4v, oga, mp3",
    smoothPlayBar: true,
    keyEnabled: true,
    audioFullScreen: false
  });
  
  $(document).on($.jPlayer.event.pause, myPlaylist.cssSelector.jPlayer,  function(){
    $('.musicbar').removeClass('animate');
    $('.jp-play-me').removeClass('active');
    $('.jp-play-me').parent('li').removeClass('active');
  });

  $(document).on($.jPlayer.event.play, myPlaylist.cssSelector.jPlayer,  function(){
    $('.musicbar').addClass('animate');
  });

  $(document).on('click', '.jp-play-me', function(e){
    e && e.preventDefault();
    var $this = $(e.target);
    if (!$this.is('a')) $this = $this.closest('a');

    $('.jp-play-me').not($this).removeClass('active');
    $('.jp-play-me').parent('li').not($this.parent('li')).removeClass('active');

    $this.toggleClass('active');
    $this.parent('li').toggleClass('active');
    if( !$this.hasClass('active') ){
      myPlaylist.pause();
    }else{
      var i = Math.floor(Math.random() * (1 + 7 - 1));
      myPlaylist.play(i);
    }
    
  });



  // video

  $("#jplayer_1").jPlayer({
    ready: function () {
      $(this).jPlayer("setMedia", {
        title: "Big Buck Bunny",
        m4v: "http://flatfull.com/themes/assets/video/big_buck_bunny_trailer.m4v",
        ogv: "http://flatfull.com/themes/assets/video/big_buck_bunny_trailer.ogv",
        webmv: "http://flatfull.com/themes/assets/video/big_buck_bunny_trailer.webm",
        poster: "images/m41.jpg"
      });
    },
    swfPath: "js",
    supplied: "webmv, ogv, m4v",
    size: {
      width: "100%",
      height: "auto",
      cssClass: "jp-video-360p"
    },
    globalVolume: true,
    smoothPlayBar: true,
    keyEnabled: true
  });

});